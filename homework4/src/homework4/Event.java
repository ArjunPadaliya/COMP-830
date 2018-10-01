package homework4;

public class Event {
	private int EventNumber;
	private int EventData;
	
	Event(int EventNumber, int EventData)
	{
		this.EventNumber = EventNumber;
		this.EventData = EventData;
	}
	
	public int getEventData()
	{
		return EventData;
	}
	
	public int getEventNumber()
	{
		return EventNumber;
	}	

}
