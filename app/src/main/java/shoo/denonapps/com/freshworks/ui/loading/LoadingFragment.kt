package shoo.denonapps.com.freshworks.ui.loading

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import dagger.android.support.DaggerDialogFragment
import shoo.denonapps.com.freshworks.R
import javax.inject.Inject

class LoadingFragment @Inject constructor() : DaggerDialogFragment() {

    companion object {
        fun progressDialog(context: Context): Dialog {
            val dialog = Dialog(context)
            val inflate = LayoutInflater.from(context).inflate(R.layout.progress_dialog, null)
            with(dialog) {
                setContentView(inflate)
                setCancelable(false)
            }
            dialog.window!!.setBackgroundDrawable(
                ColorDrawable(Color.TRANSPARENT)
            )
            return dialog
        }
    }

}