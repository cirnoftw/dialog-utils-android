package pro.appcraft.lib.utils.dialog

import com.google.android.material.bottomsheet.BottomSheetDialog

data class BottomDialogAction(
    val text: String,
    val selected: Boolean? = null,
    val callback: (dialog: BottomSheetDialog) -> Unit
)
