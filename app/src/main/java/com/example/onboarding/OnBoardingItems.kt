package com.example.onboarding

class OnBoardingItems(
    val image: Int,
    val title: Int,
    val desc: Int
) {
    companion object{
        fun getData(): List<OnBoardingItems>{
            return listOf(
                OnBoardingItems(R.drawable.cars, R.string.app_name,R.string.app_name),
                OnBoardingItems(R.drawable.cars, R.string.app_name, R.string.app_name),
                OnBoardingItems(R.drawable.cars, R.string.app_name,R.string.app_name)
            )
        }
    }
}