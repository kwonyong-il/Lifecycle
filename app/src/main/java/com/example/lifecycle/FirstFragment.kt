package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("FirstFragment", "onCreate succeed")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("FirstFragment", "onCreateView succeed")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("FirstFragment", "onViewCreated succeed")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        Log.d("FirstFragment", "onViewStateRestored succeed")
    }

    override fun onStart() {
        super.onStart()

        Log.d("FirstFragment", "onStart succeed")
    }

    override fun onResume() {
        super.onResume()

        Log.d("FirstFragment", "onResume succeed")
    }

    override fun onPause() {
        super.onPause()

        Log.d("FirstFragment", "onPause succeed")
    }

    override fun onStop() {
        super.onStop()

        Log.d("FirstFragment", "onStop succeed")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d("FirstFragment", "onSaveInstanceState succeed")
        //액티비티 버튼에서는 remove()를 호출해서 프래그먼트를 제거하기 때문에 "Exit Fragment"를 눌러서 프래그먼트 종료시에는  onSaveInstanceState()의 Log는 찍히지 않는다.
        //위에 코드에서는 Fragment를 화면에 띄운 상태로 Second Activity로 이동하거나 홈 화면으로 갔을때 로그가 찍힌다.
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d("FirstFragment", "onDestroyView succeed")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("FirstFragment", "onDestroy succeed")
    }


}