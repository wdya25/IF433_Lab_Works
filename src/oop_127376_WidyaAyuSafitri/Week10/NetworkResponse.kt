package oop_127376_WidyaAyuSafitri.Week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)