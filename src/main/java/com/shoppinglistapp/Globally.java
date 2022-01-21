package com.shoppinglistapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.SparseBooleanArray;
import android.view.Gravity;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/*========================= CONSTANT VARIABLES =======================*/
public class Globally {

    public static SharedPreferences preferences, prefs;

    SharedPreferences sharedpreferences;

   //original links

      public static String DOMAIN_U = "https://www.bizplora.com/";
     public static String DOMAIL_URL = "https://www.bizplora.com/emobishopper/";

    public static String DOMAIL_URL3 = "https://www.bizplora.com/";



}
