package pt6.demo3;

public class ParameterTest {

    public void editPrimeValue(int argument) {
        argument = argument + 5;
    }

    public void editRefValue(int[] argArr) {
        argArr[0] = 666;
    }

    public static void main(String[] args) {
        ParameterTest test = new ParameterTest();

        int num = 10;
        System.out.println("Before method call: " + num);
        test.editPrimeValue(num);
        System.out.println("After method call (primitive): " + num);

        int[] arr = {1, 2, 3};
        System.out.println("Before method call: " + arr[0]);
        test.editRefValue(arr);
        System.out.println("After method call (reference): " + arr[0]);
    }
}

