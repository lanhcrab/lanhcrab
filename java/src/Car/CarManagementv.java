package Car;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class CarManagement {

    // Hàm dựng
    public CarManagement(){
        super();
    }

    // Phương thức readData() cho phép đọc dữ liệu từ tệp văn bản
	/*
	    Thứ tự nhập như sau:
	    - Nhập số lượng xe
	    - Trong vòng lặp với mỗi loại xe:
	       - Nhập 1 số nguyên c, c = 0 là ServiceCar, c = 1 là SportCar
	       - Nhập thông tin của các xe: id, name, manufacturer, hours, price, fee (Đối với ServiceCar, tax với SportCar)
	*/

    public ArrayList<Car> readData(String fileName) {

        ArrayList<Car> res = new ArrayList<Car>();

        try {
            Scanner sc = new Scanner(new File(fileName));
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < n; i++) {
                int c = Integer.parseInt(sc.nextLine());
                if (c == 0) {
                    String id = sc.nextLine();
                    String name = sc.nextLine();
                    String manufacturer = sc.nextLine();
                    double hours = Double.parseDouble(sc.nextLine());
                    double price = Double.parseDouble(sc.nextLine());
                    double fee = Double.parseDouble(sc.nextLine());

                    ServiceCar serviceCar = new ServiceCar(id, name, manufacturer, hours, price, fee);
                    res.add(serviceCar);
                }
                else if (c == 1) {
                    String id = sc.nextLine();
                    String name = sc.nextLine();
                    String manufacturer = sc.nextLine();
                    double hours = Double.parseDouble(sc.nextLine());
                    double price = Double.parseDouble(sc.nextLine());
                    double tax = Double.parseDouble(sc.nextLine());

                    SportCar sportCar = new SportCar(id, name, manufacturer, hours, price, tax);
                    res.add(sportCar);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    // Phương thức in danh sách thông tin liên quan các loại xe trong mảng
    public void printCars(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }
    }

    // Phương thức xuất ra danh sách những xe có tên nhà sản xuất là "manuName"
    public ArrayList<Car> findCars(ArrayList<Car> cars, String manuName){

        ArrayList<Car> resFind = new ArrayList<Car>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getManufacturer().equals(manuName))
                resFind.add(cars.get(i));
        }
        return resFind;

    }

    // Phương thức xuất ra danh sách những xe giá thành tiền (amount) cao nhất thuộc loại typeOfCars

    public ArrayList<Car> getMaxAmount(ArrayList<Car> cars, String typeOfCars){

        double max = Double.MIN_VALUE + 2;
        ArrayList<Car> resMaxAmount = new ArrayList<Car>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getClass().getSimpleName().equals(typeOfCars)) {
                if (cars.get(i).getAmount() > max) {
                    max = cars.get(i).getAmount();
                }
            }
        }

        for (int i = 0; i < cars.size(); i++) {
            if (max == cars.get(i).getAmount())
                resMaxAmount.add(cars.get(i));
        }
        return resMaxAmount;
    }

    // Phướng thức sắp xếp giá thành tiền các loại xe theo thứ tự giảm dần
    public void sortByAmount(ArrayList<Car> cars){

        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = i + 1; j < cars.size() ; j++) {
                if (cars.get(i).getAmount() < cars.get(j).getAmount()) {
                    Car temp = cars.get(i);
                    cars.set(i, cars.get(j));
                    cars.set(j, temp);
                }
            }
        }
    }


    // Hàm main
    public static void main(String[] args) {
        CarManagement carManag = new CarManagement();
        ArrayList<Car> cars = carManag.readData("data.txt");
        //	carManag.printCars(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).getAmount() + " ");
        }
        System.out.println();
        ArrayList<Car> carsList = carManag.findCars(cars,"honda");
        carManag.printCars(carsList);

        ArrayList<Car> carsList1 = carManag.getMaxAmount(cars, "SportCar");
        carManag.printCars(carsList1);

        carManag.sortByAmount(cars);
        carManag.printCars(cars);

    }
}
