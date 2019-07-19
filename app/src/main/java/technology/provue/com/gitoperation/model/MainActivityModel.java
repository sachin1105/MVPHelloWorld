package technology.provue.com.gitoperation.model;

import technology.provue.com.gitoperation.contract.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {


    @Override
    public String generateMessage() {
        return "Hello MVP World";
    }

}//end of class
