package com.bossed.waej.javebean

data class NeedRepairResponse(
    val code: Int,
    val `data`: NeedRepairData,
    val message: String
)

data class NeedRepairData(
    val endRow: Int,
    val hasNextPage: Boolean,
    val hasPreviousPage: Boolean,
    val isFirstPage: Boolean,
    val isLastPage: Boolean,
    val list: List<NeedRepairBean>,
    val navigateFirstPage: Int,
    val navigateLastPage: Int,
    val navigatePages: Int,
    val navigatepageNums: List<Int>,
    val nextPage: Int,
    val pageNum: Int,
    val pageSize: Int,
    val pages: Int,
    val prePage: Int,
    val size: Int,
    val startRow: Int,
    val total: Int
)

data class NeedRepairBean(
    val account: String,
    val address: String,
    val browseCount: Int,
    val businessBegin: String,
    val businessEnd: String,
    val businessIntroduction: String,
    val businessStatus: Int,
    val businesstime: String,
    val city: String,
    val contactName: String,
    val contactPhone: String,
    val county: String,
    val createdTime: String,
    val deposit: Double,
    val deviceDescription: String,
    val distance: String,
    val doorPhoto: String,
    val followCount: Int,
    val fullname: String,
    val housekeeperId: Int,
    val id: Int,
    val isprized: Int,
    val latitude: String,
    val longitude: String,
    val mainModels: String,
    val operationStation: Int,
    val orderCancelCount: Int,
    val orderCount: Int,
    val praseCount: Int,
    val province: String,
    val score: Int,
    val shopDescription: String,
    val shopLogo: String,
    val shopPhone: String,
    val shopTrade: String,
    val shopkeeperId: Int,
    val status: Int,
    val technicianNum: Int,
    val updatedTime: String,
    val repairDate: String,
    val orderNum: String
)