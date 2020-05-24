public class UserInterfaceForAdmin {

    public void displayShuttleInfo()
    {
        Shuttle st = new Shuttle();
        int shuttleNumber = st.countLines();
        int shuttleId = 0;
        String shuttleName = "";
        int manufactureYear = 0;
        double fuelCapacity = 0;
        int passengerCapacity = 0;
        int cargoCapacity = 0;
        int travelSpeed = 0;
        for (int i = 0; i <= shuttleNumber - 1; i++)
        {
            shuttleId = Integer.parseInt(st.readFileByLines().get(i).split(",")[0]);
            shuttleName = st.readFileByLines().get(i).split(",")[1];
            manufactureYear = Integer.parseInt(st.readFileByLines().get(i).split(",")[2]);
            fuelCapacity = Double.parseDouble(st.readFileByLines().get(i).split(",")[3]);
            passengerCapacity = Integer.parseInt(st.readFileByLines().get(i).split(",")[4]);
            cargoCapacity = Integer.parseInt(st.readFileByLines().get(i).split(",")[5]);
            travelSpeed = Integer.parseInt(st.readFileByLines().get(i).split(",")[6]);
            System.out.println("============================================================");
            System.out.println("Shuttle ID is " + shuttleId);
            System.out.println("Shuttle Name is " + shuttleName);
            System.out.println("Manufacturing Year is " + manufactureYear);
            System.out.println("Fuel Capacity is " + fuelCapacity + " million pounds");
            System.out.println("Passenger Capacity is " + passengerCapacity);
            System.out.println("Cargo Capacity is " + cargoCapacity + " kg");
            System.out.println("Travel Speed is " + travelSpeed + " kilometers per hour");
            System.out.println();
        }
    }

}
