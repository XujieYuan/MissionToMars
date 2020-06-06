public class RandomNumber {

    private int maximumValue;
    private int minimumValue;
    /**
     * Constructor for objects of class RNG
     */
    public RandomNumber()
    {
        maximumValue = 1;
        minimumValue = 0;
    }
    public int getMaximumValue()
    {
        return maximumValue;
    }
    public int getMinimumValue()
    {
        return minimumValue;
    }
    public void setMaximumValue(int newMaximumValue)
    {
        maximumValue = newMaximumValue;
    }
    public void setMinimumValue(int newMinimumValue)
    {
        minimumValue = newMinimumValue;
    }
    public int getRandomNumber(int maximumValue, int minimumValue)
    {
        return minimumValue + (int)(Math.random()*(maximumValue-minimumValue+1));
    }

}
