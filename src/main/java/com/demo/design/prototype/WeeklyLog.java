package com.demo.design.prototype;

public class WeeklyLog {
    public Attachment Attachment ;
    public String Name { get; set; }
    public string Date { get; set; }
    public string Content { get; set; }
    /// <summary>
    /// 使用MemberwiseClone()实现浅克隆
    /// </summary>
    /// <returns></returns>
    //public WeeklyLog Clone()
    //{
    //    return (WeeklyLog)this.MemberwiseClone();
    //}

    //使用序列化的方式实现深克隆
    public WeeklyLog Clone()
    {
        WeeklyLog clone = null;
        FileStream fs = new FileStream("temp.dat", FileMode.Create);
        BinaryFormatter formatter = new BinaryFormatter();
        try
        {
            formatter.Serialize(fs, this);
        }
        catch (SerializationException e)
        {
            Console.WriteLine("Failed to Serialize . Reason :" + e.Message);
            throw;
        }
        finally
        {
            fs.Close();
        }
        FileStream fs1 = new FileStream("temp.dat", FileMode.Open);
        BinaryFormatter formatter1 = new BinaryFormatter();
        try
        {
            clone = (WeeklyLog)formatter.Deserialize(fs1);//反序列化
        }
        catch (SerializationException e)
        {
            Console.WriteLine("Failed to deserialize. Reasion:" + e.Message);
            throw;
        }
        finally
        {
            fs1.Close();
        }

        return clone;
    }
}
}
