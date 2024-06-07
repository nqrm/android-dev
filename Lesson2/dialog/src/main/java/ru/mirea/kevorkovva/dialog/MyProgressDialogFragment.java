package ru.mirea.kevorkovva.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import org.jetbrains.annotations.Nullable;


// Depracted в API 26
// вместо него предлагается использовать progressbar в xml
// Но и так работает)
public class MyProgressDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Загрузка");
        progressDialog.setCancelable(true);
        return progressDialog;
    }
}
