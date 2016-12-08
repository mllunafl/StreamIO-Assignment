import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by LunaFlores on 12/8/16.
 */
public class Foo {
    private String temp;
    private boolean flag;
    private double amount;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "temp='" + temp + '\'' +
                ", flag=" + flag +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) throws IOException {
        Foo foo = new Foo();
        foo.setAmount(11);
        foo.setFlag(true);
        foo.setTemp("and I have that going for me");

        System.out.println("foo before " + foo);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(foo);
        System.out.println("jason is: " + json);

        Foo foo2 = mapper.readValue(json, Foo.class);
        System.out.println("foo2 " + foo2);
    }
}


