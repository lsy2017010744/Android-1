package com.example.eric.mycal;


public class UnitConversion {
    public static String conversion(String s,String s1,String s2){
        String d="";
        double e=0;
        int i =0;
        switch (s1){
            case "厘米":
                switch (s2){
                    case "厘米":
                        d=s;
                        break;
                    case "分米":
                        e=Double.valueOf(s);
                        e=e/10;
                        d=String.valueOf(e);
                        break;
                    case "米":
                        e=Double.valueOf(s);
                        e=e/100;
                        d=String.valueOf(e);
                        break;
                    case "千米":
                        e=Double.valueOf(s);
                        e=e/1000000;
                        d=String.valueOf(e);
                        break;
                }
                break;
            case "分米":
                switch (s2){
                    case"厘米":
                        e=Double.valueOf(s);
                        e=e*10;
                        d=String.valueOf(e);
                        break;
                    case"分米":
                        d=s;
                        break;
                    case "米":
                        e=Double.valueOf(s);
                        e=e/10;
                        d=String.valueOf(e);
                        break;
                    case"千米":
                        e=Double.valueOf(s);
                        e=e/100000;
                        d=String.valueOf(e);
                        break;
                }
                break;
            case "米":
                switch (s2){
                    case"厘米":
                        e=Double.valueOf(s);
                        e=e*100;
                        d=String.valueOf(e);
                        break;
                    case"分咪咪":
                        e=Double.valueOf(s);
                        e=e*10;
                        d=String.valueOf(e);
                        break;
                    case "米":
                        d=s;
                        break;
                    case"千米":
                        e=Double.valueOf(s);
                        e=e/1000;
                        d=String.valueOf(e);
                        break;
                }
                break;
            case "千米":
                switch (s2){
                    case"厘米":
                        e=Double.valueOf(s);
                        e=e*1000000;
                        d=String.valueOf(e);
                        break;
                    case"分米":
                        e=Double.valueOf(s);
                        e=e*10000;
                        d=String.valueOf(e);
                        break;
                    case "米":
                        e=Double.valueOf(s);
                        e=e*1000;
                        d=String.valueOf(e);
                        break;
                    case"千米":
                        d=s;
                        break;
                }
                break;
            case"二进制":
                switch (s2){
                    case"四进制":

                        i=Integer.parseInt(s,2);
                        d=Integer.toString(i, 4);
                    case"八进制":

                        i=Integer.parseInt(s,2);
                        d=Integer.toString(i, 8);
                    case"十进制":

                        i=Integer.parseInt(s,2);
                        d=Integer.toString(i, 10);
                    case"十六进制":

                        i=Integer.parseInt(s,2);
                        d=Integer.toString(i, 16);
                    case"二进制":

                        i=Integer.parseInt(s,2);
                        d=Integer.toString(i, 2);


                }
            case"四进制":
                switch (s2){
                    case"四进制":

                        i=Integer.parseInt(s,4);
                        d=Integer.toString(i, 4);
                    case"八进制":

                        i=Integer.parseInt(s,4);
                        d=Integer.toString(i, 8);
                    case"十进制":

                        i=Integer.parseInt(s,4);
                        d=Integer.toString(i, 10);
                    case"十六进制":

                        i=Integer.parseInt(s,4);
                        d=Integer.toString(i, 16);
                    case"二进制":

                        i=Integer.parseInt(s,4);
                        d=Integer.toString(i, 2);
                }
            case"八进制":
                switch (s2){
                    case"四进制":

                        i=Integer.parseInt(s,8);
                        d=Integer.toString(i, 4);
                    case"八进制":

                        i=Integer.parseInt(s,8);
                        d=Integer.toString(i, 8);
                    case"十进制":

                        i=Integer.parseInt(s,8);
                        d=Integer.toString(i, 10);
                    case"十六进制":

                        i=Integer.parseInt(s,8);
                        d=Integer.toString(i, 16);
                    case"二进制":

                        i=Integer.parseInt(s,8);
                        d=Integer.toString(i, 2);
                }
            case"十进制":
                switch (s2){
                    case"四进制":

                        i=Integer.parseInt(s,10);
                        d=Integer.toString(i, 4);
                    case"八进制":

                        i=Integer.parseInt(s,10);
                        d=Integer.toString(i, 8);
                    case"十进制":

                        i=Integer.parseInt(s,10);
                        d=Integer.toString(i, 10);
                    case"十六进制":

                        i=Integer.parseInt(s,10);
                        d=Integer.toString(i, 16);
                    case"二进制":

                        i=Integer.parseInt(s,10);
                        d=Integer.toString(i, 2);
                }

            case"十六进制":
                switch (s2){
                    case"四进制":

                        i=Integer.parseInt(s,16);
                        d=Integer.toString(i, 4);
                    case"八进制":

                        i=Integer.parseInt(s,16);
                        d=Integer.toString(i, 8);
                    case"十进制":

                        i=Integer.parseInt(s,16);
                        d=Integer.toString(i, 10);
                    case"十六进制":

                        i=Integer.parseInt(s,16);
                        d=Integer.toString(i, 16);
                    case"二进制":

                        i=Integer.parseInt(s,16);
                        d=Integer.toString(i, 2);
                }
            case"秒":
                switch (s2){
                    case"秒":
                        d=s;
                        break;
                    case "分":
                        e=Double.valueOf(s);
                        e=e/60;
                        d=String.valueOf(e);
                        break;
                    case"小时":
                        e=Double.valueOf(s);
                        e=e/3600;
                        d=String.valueOf(e);
                        break;
                }
                break;
            case"分":
                switch (s2){
                    case"秒":
                        e=Double.valueOf(s);
                        e=e*60;
                        d=String.valueOf(e);
                        break;
                    case"分":
                        d=s;
                        break;
                    case"小时":
                        e=Double.valueOf(s);
                        e=e/60;
                        d=String.valueOf(e);
                        break;
                }
                break;
            case"时":
                switch (s2){
                    case"秒":
                        e=Double.valueOf(s);
                        e=e*3600;
                        d=String.valueOf(e);
                        break;
                    case"分":
                        e=Double.valueOf(s);
                        e=e*60;
                        d=String.valueOf(e);
                        break;
                    case "时":
                        d=s;
                        break;
                }
                break;
            case"克":
                switch (s2){
                    case"克":
                        d=s;
                        break;
                    case"千克":
                        e=Double.valueOf(s);
                        e=e/1000;
                        d=String.valueOf(e);
                        break;
                    case"吨":
                        e=Double.valueOf(s);
                        e=e/1000000;
                        d=String.valueOf(e);
                        break;
                }
                break;
            case"千克":
                switch (s2){
                    case"克":
                        e=Double.valueOf(s);
                        e=e*1000;
                        d=String.valueOf(e);
                        break;
                    case"千克":
                        d=s;
                        break;
                    case"吨":
                        e=Double.valueOf(s);
                        e=e/1000;
                        d=String.valueOf(e);
                        break;
                }
                break;
            case "吨":
                switch (s2){
                    case"克":
                        e=Double.valueOf(s);
                        e=e*1000000;
                        d=String.valueOf(e);
                        break;
                    case"千克":
                        e=Double.valueOf(s);
                        e=e*1000;
                        d=String.valueOf(s);
                        break;
                    case"吨":
                        d=s;
                        break;
                }
                break;
        }
        return d;
    }


}
