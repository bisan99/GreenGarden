package bisan.android.greengarden;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private BottomNavigationView mBtmView;
    private int mMenuId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AskyCommunity.class);
                startActivity(intent);

            }
        });
//        mBtmView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
//        mBtmView.setOnNavigationItemSelectedListener(this);
//        mBtmView.getMenu().findItem(R.id.page_1).setChecked(true);

        mBtmView= (BottomNavigationView)findViewById(R.id.bottom_navigation);
        mBtmView.getMenu().findItem(R.id.page_1).setChecked(true);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mMenuId = item.getItemId();
        for (int i = 0; i < mBtmView.getMenu().size(); i++) {
            MenuItem menuItem = mBtmView.getMenu().getItem(i);
            boolean isChecked = menuItem.getItemId() == item.getItemId();
            menuItem.setChecked(isChecked);
        }

//        switch (item.getItemId()) {
//            case R.id.page_1: {
//                Intent intent = new Intent(MainActivity.this, Community.class);
//                startActivity(intent);
//            }
//            break;
//            case R.id.page_2: {
//                Intent intent = new Intent(MainActivity.this, Profile.class);
//                startActivity(intent);
//            }
//            break;
//
//        }
        switch (item.getItemId()) {
            case R.id.page_1:
                Intent intent = new Intent(MainActivity.this, Community.class);
                startActivity(intent);
                break;
            case R.id.page_2:
                Intent intent1 = new Intent(MainActivity.this, Profile.class);
                startActivity(intent1);
                break;
        }
        return true;
    }
    public void OnClickPost(View view) {
    }

    public void OnClickFarmer(View view) {
    }

    public void OnClickAgronomists(View view) {
    }
}
//    public void onNavigationItemSelected(MenuItem item) {
//        Fragment fragment;
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.page_1) {
//            Intent intent = new Intent(MainActivity.this, Community.class);
//            startActivity(intent);
//        } else if (id == R.id.page_2) {
//            Intent intent = new Intent(MainActivity.this, Profile.class);
//            startActivity(intent);
//        }
//    }
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.page_1:
//                Intent intent = new Intent(MainActivity.this, Community.class);
//                startActivity(intent);
//                break;
//            case R.id.page_2:
//                Intent intent2 = new Intent(MainActivity.this, Profile.class);
//                startActivity(intent2);                          break;
//
//            default:
//                return false;
//        }
//
//        updateNavigationBarState(item.getItemId());
//
//        return true;
//    }

//    private void updateNavigationBarState(int itemId) {
//        BottomNavigationView bottomNavigationView;
//        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
//        Menu menu = bottomNavigationView.getMenu();
//
//        for (int i = 0, size = menu.size(); i < size; i++) {
//            MenuItem item = menu.getItem(i);
//            item.setChecked(item.getItemId() == itemId);
//        }
//    }





//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;

//            public boolean onNavigationItemSelected(MenuItem item) {
//                // Handle navigation view item clicks here.
//                Fragment fragment;
//                int id = item.getItemId();
//
//                if (id == R.id.page_1) {
//                    // Handle the camera action
//                    fragment = new Community();
//                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                    ft.replace(R.id.page_2, fragment);
//                    ft.commit();
//                } else if (id == R.id.page_2) {
//                    fragment = new Profile();
//                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                    ft.replace(R.id.page_1, fragment);
//                    ft.commit();
//                }
//
//                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.bottom_navigation);
//                drawer.closeDrawer(GravityCompat.START);
//                return true;
//            }



//        b=(Button)findViewById(R.id.btnSelectPhoto);
//        viewImage=(ImageView)findViewById(R.id.viewImage);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                selectImage();
//            }
//        });

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds options to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//    private void selectImage() {
//        final CharSequence[] options = { "Take Photo", "Choose from Gallery","Cancel" };
//        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//        builder.setTitle("Add Photo!");
//        builder.setItems(options, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int item) {
//                if (options[item].equals("Take Photo"))
//                {
//                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                    File f = new File(android.os.Environment.getExternalStorageDirectory(), "temp.jpg");
//                    intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));
//                    startActivityForResult(intent, 1);
//                }
//                else if (options[item].equals("Choose from Gallery"))
//                {
//                    Intent intent = new   Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                    startActivityForResult(intent, 2);
//                }
//                else if (options[item].equals("Cancel")) {
//                    dialog.dismiss();
//                }
//            }
//        });
//        builder.show();
//    }
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == RESULT_OK) {
//            if (requestCode == 1) {
//                File f = new File(Environment.getExternalStorageDirectory().toString());
//                for (File temp : f.listFiles()) {
//                    if (temp.getName().equals("temp.jpg")) {
//                        f = temp;
//                        break;
//                    }
//                }
//                try {
//                    Bitmap bitmap;
//                    BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
//                    bitmap = BitmapFactory.decodeFile(f.getAbsolutePath(),
//                            bitmapOptions);
//                    viewImage.setImageBitmap(bitmap);
//                    String path = android.os.Environment
//                            .getExternalStorageDirectory()
//                            + File.separator
//                            + "Phoenix" + File.separator + "default";
//                    f.delete();
//                    OutputStream outFile = null;
//                    File file = new File(path, String.valueOf(System.currentTimeMillis()) + ".jpg");
//                    try {
//                        outFile = new FileOutputStream(file);
//                        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, outFile);
//                        outFile.flush();
//                        outFile.close();
//                    } catch (FileNotFoundException e) {
//                        e.printStackTrace();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            } else if (requestCode == 2) {
//                Uri selectedImage = data.getData();
//                String[] filePath = { MediaStore.Images.Media.DATA };
//                Cursor c = getContentResolver().query(selectedImage,filePath, null, null, null);
//                c.moveToFirst();
//                int columnIndex = c.getColumnIndex(filePath[0]);
//                String picturePath = c.getString(columnIndex);
//                c.close();
//                Bitmap thumbnail = (BitmapFactory.decodeFile(picturePath));
//                Log.w("path of image from gallery......******************.........", picturePath+"");
//                viewImage.setImageBitmap(thumbnail);
//            }
//        }
//    }

