package com.zanclick.testvue;

public class EnumTest {
    public  enum State{
      faild(1,"创建失败"),
        success(0,"创建成功"),
        waiting(2,"等待");

        State(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        private  Integer code;
        private String desc;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public static void main(String[] args) {
        String str = "hello,world,你,好";
        String replace = str.replace(",","-");
        System.out.println(replace);
    }
}
