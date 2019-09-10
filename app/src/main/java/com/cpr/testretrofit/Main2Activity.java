package com.cpr.testretrofit;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cpr.testretrofit.api.GetListData;
import com.cpr.testretrofit.model.Data;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {
    private ImageView img;
    private Button btnCapture;
    private File imgFileFolder;
    private String currentPhotoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnCapture = findViewById(R.id.capture);
        img = findViewById(R.id.img);
//        imgFileFolder = new File(Environment.getExternalStorageState(), "CameraIntetn");
//        final File imageFileName = new File(imgFileFolder, "bitmap.jpg");
//
//        currentPhotoPath = imageFileName.getAbsolutePath();



        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dispatchTakePictureIntent();
//                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE,, 1);
//                Uri photoURI = FileProvider.getUriForFile(Main2Activity.this,
//                        "com.example.android.fileprovider",
//                        imageFileName);
//                intent.putExtra(MediaStore.EXTRA_OUTPUT,)
//                startActivityForResult(new Intent(MediaStore.ACTION_IMAGE_CAPTURE), 1);
            }
        });


//        Call<Data> call = GetListData.getListData().getListData();
//
//
//
//        call.enqueue(new Callback<Data>() {
//            @Override
//            public void onResponse(Call<Data> call, Response<Data> response) {
//                Log.e("TAG", " " + response.body().getSuccess());
//                for (int i = 0; i < response.body().getList().size(); i++){
//                    Log.e("TAG", "" + response.body().getList().get(i).getId());
//                    Log.e("TAG", "" + response.body().getList().get(i).getName());
//                    Log.e("TAG", "" + response.body().getList().get(i).getPackageName());
//                    Log.e("TAG", "" + response.body().getList().get(i).getBackGroundStart());
//                    Log.e("TAG", "" + response.body().getList().get(i).getBackGroundEndColor());
//                    Log.e("TAG", "" + response.body().getList().get(i).getBgButtonClicked());
//                    Log.e("TAG", " " + response.body().getList().get(i).getBgButtonUnclicked());
//                    Log.e("TAG", " " + response.body().getList().get(i).getBgTextTitleColor());
//                    Log.e("TAG", "" + response.body().getList().get(i).getBgButtonInstall());
//
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Data> call, Throwable t) {
//
//            }
//        });
    }

    private File createImageFile() throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,
                ".jpg",
                storageDir
        );
        currentPhotoPath = image.getAbsolutePath();
        return image;
    }

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            File photoFile = null;
            try {
                photoFile = createImageFile();
            } catch (IOException ex) {
            }
            if (photoFile != null) {
                Uri photoURI = FileProvider.getUriForFile(this,
                        "com.cpr.testretrofit",
                        photoFile);
                takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI);
                startActivityForResult(takePictureIntent, 1);
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                Log.e("TAG"," " + data);
                Bitmap bitmap = BitmapFactory.decodeFile(currentPhotoPath);
                Log.e("TAG", " " + currentPhotoPath);
//                Bitmap uri = (Bitmap) data.getExtras().get("data");
//                Log.e("TAG", "uri " + uri);
//                Bitmap bitmap = BitmapFactory.decodeFile(uri.getPath());
                Log.e("TAG", "success");
//                galleryAddPic();
                img.setImageBitmap(bitmap);
            }
        }
    }


}
