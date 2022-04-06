package com.MCb.garmentfactory;

import android.os.Environment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DebugLog {
    private final static String TAG = "Garment";
    private final static SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
    private final static String LOG_FILE_NAME = "/logging.txt";

    public static void Log(String msg) {
        if (BuildConfig.DEBUG) {
            try {
                File dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                dir.mkdirs();
                FileWriter stream = new FileWriter(dir.getAbsolutePath() + LOG_FILE_NAME, true);
                BufferedWriter buffer = new BufferedWriter(stream);
                buffer.write(fmt.format(new Date()) + "> ");
                buffer.write(msg);
                buffer.newLine();
                buffer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
