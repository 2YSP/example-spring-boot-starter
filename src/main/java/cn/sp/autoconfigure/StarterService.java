package cn.sp.autoconfigure;


/**
 * Created by 2YSP on 2019/5/22.
 */
public class StarterService {

    private String config;

    public StarterService(String config){
        this.config = config;
    }

    public String[] split(String separatorChar){
        return this.config.split(separatorChar);
    }
}
