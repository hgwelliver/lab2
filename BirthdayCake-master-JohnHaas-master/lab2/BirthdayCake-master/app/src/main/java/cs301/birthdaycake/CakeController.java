package cs301.birthdaycake;

public class CakeController {

    private CakeView myCakeView;
    private CakeModel myCakeModel = myCakeView.getCakeView();

    public CakeController(CakeView myCakeView){

        this.myCakeView = myCakeView;
        this.myCakeModel = myCakeView.getCakeView();

    }
}
