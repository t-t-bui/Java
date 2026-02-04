public class ApointmentBook {
	private boolean isMinuteFree(int period, int minute){}

	Private void reserveBlock(int period, int startMinute, int duration){}

	public int findFreeBlock(int period, int duration){
		int count = 0;

		for(int i = 0; i < 60; i++){
			if(isMinuteFree(period, i)){
				count ++;
				if(count == duration) return i - (count -1);
			} else count = 0;
		}

		return -1;
	}

	public boolean makeAppointment(int startPeriod, int endPeriod, int duration){
		for(int i = startPeriod, i <= endPeriod; i++){
			if(findFreeBlock(i, duration) >= 0) {
				reserveBlock(i, findFreeBlock(i, duration), duration);
				return true;
			}
		}

		return false;
	}
}