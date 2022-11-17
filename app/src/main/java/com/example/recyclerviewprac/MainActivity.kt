package com.example.recyclerviewprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewprac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)


        val profileList = arrayListOf(
            Profiles(R.drawable.man, "하정우", 34, "Senior Developer"),
            Profiles(R.drawable.girl, "이지은", 30, "Junior Developer"),
            Profiles(R.drawable.man, "이병헌", 40, "Senior Developer"),
            Profiles(R.drawable.girl, "신민아", 36, "Mid Developer"),
            Profiles(R.drawable.man, "조정석", 35, "Mid Developer"),
            Profiles(R.drawable.girl, "전지현", 38, "Senior Developer"),
            Profiles(R.drawable.man, "마동석", 39, "Senior Developer"),
            Profiles(R.drawable.girl, "이주영", 38, "Junior Developer"),
            Profiles(R.drawable.man, "박서준", 30, "Junior Developer"),
            Profiles(R.drawable.man, "유연석", 32, "Mid Developer"),
            Profiles(R.drawable.man, "이정재", 38, "Senior Developer"),
            Profiles(R.drawable.girl, "김다미", 26, "Junior Developer"),
        )

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvProfile.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProfile.setHasFixedSize(true)
        binding.rvProfile.adapter = ProfileAdapter(profileList)

    }

    // 액티비티가 파괴될때
    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}
