package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private CakeView myCakeView;
    private CakeModel myCakeModel;

    public CakeController(CakeView myCakeViewTemp){

        this.myCakeView = myCakeViewTemp;
        this.myCakeModel = myCakeViewTemp.getCakeView();

    }

    @Override
    public void onClick(View v) {
        Log.d("tag","Test");
        myCakeModel.lit = !myCakeModel.lit;
        myCakeView.invalidate();

    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    {
        Log.d("tag", "Test");

        if (isChecked == true)
        {
            myCakeModel.isCandles = true;
        }
        else {
            myCakeModel.isCandles = false;

        }
        myCakeView.invalidate();
    }

}
