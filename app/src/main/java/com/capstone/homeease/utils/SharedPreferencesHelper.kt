package com.capstone.homeease.utils

import android.content.Context
import android.content.SharedPreferences
import android.net.Uri
import com.capstone.homeease.model.Expert
import com.capstone.homeease.model.ExpertProfileResponse

object SharedPreferencesHelper {

    // Save the user ID to SharedPreferences
    fun saveUserId(context: Context, userId: Int) {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putInt("user_id", userId)
        editor.apply()
    }

    // Get the user ID from SharedPreferences
    fun getUserId(context: Context): Int {
        val sharedPreferences: SharedPreferences = context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        return sharedPreferences.getInt("user_id", -1) // Returns -1 if no user ID is found
    }


}
