
package problem2;

public class IntegerList
{
    int[] list;
    int count = 0;

    //-------------------------------------------------------
    // create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }

    //-------------------------------------------------------
    // fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i = 0; i < list.length; i++)
        {
            list[i] = (int)(Math.random() * 100) + 1;
        }
        count = list.length; // now list is full
    }

    //-------------------------------------------------------
    // print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i = 0; i < count; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    //-------------------------------------------------------
    // make the list bigger (double its size)
    //-------------------------------------------------------
    public void increaseSize()
    {
        int[] bigger = new int[list.length * 2];
        for (int i = 0; i < list.length; i++)
        {
            bigger[i] = list[i];
        }
        list = bigger;
    }

    //-------------------------------------------------------
    // check if the list is full
    //-------------------------------------------------------
    private boolean isFull()
    {
        return count == list.length;
    }

    //-------------------------------------------------------
    // add a new number at the end
    //-------------------------------------------------------
    public void addElement(int newValue)
    {
        if (isFull())
        {
            increaseSize();
        }
        list[count] = newValue;
        count++;
    }

    //-------------------------------------------------------
    // remove the first time a value appears
    //-------------------------------------------------------
    public void removeFirst(int value)
    {
        for (int i = 0; i < count; i++)
        {
            if (list[i] == value)
            {

                for (int j = i; j < count - 1; j++)
                {
                    list[j] = list[j + 1];
                }
                count--;
                return;
            }
        }
        System.out.println("Value not found.");
    }

    //-------------------------------------------------------
    // remove all times a value appears
    //-------------------------------------------------------
    public void removeAll(int value)
    {
        int i = 0;
        while (i < count)
        {
            if (list[i] == value)
            {
                // shift everything left
                for (int j = i; j < count - 1; j++)
                {
                    list[j] = list[j + 1];
                }
                count--;
            }
            else
            {
                i++;
            }
        }
    }
}
