package com.nebiroz.thinkingjava.lessons;

/**
 * Created by Frost on 07.11.2015.
 */

public class FactoryTask {
    private int _chapter = 0;
    private int _ex = 0;
    private int _exc = 0;

    public FactoryTask(){ }

    public FactoryTask(int chapter, int ex, int exc){
        _chapter = chapter;
        _ex = ex;
        _exc = exc;
    }

    public BaseExample getTask(int chapter, int ex, int exc){
        _chapter = chapter;
        _ex = ex;
        _exc = exc;
        return getTask();
    }

    public BaseExample getTask(){
        BaseExample example = null;
        Class exTmp = null;
        String signature = "com.nebiroz.thinkingjava.lessons";

        if (_chapter > 0){
            signature += ".chapter" +String.format("%02d", _chapter);

            if(_ex > 0){
                signature += ".Example" + String.format("%02d", _ex);
            }
            else if(_exc > 0){
                signature += ".Exercise" + String.format("%02d", _exc);
            }
        }
        try {
            exTmp = Class.forName(signature);
            example = (BaseExample) exTmp.newInstance();
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            //System.out.println("Not found class");
            //System.out.println(signature);
            return null;
        }

        return example;
    }
}
