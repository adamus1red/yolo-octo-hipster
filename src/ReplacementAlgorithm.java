
public abstract class ReplacementAlgorithm {

	// No of page faults
	protected int pageFaultCount;
	
	// the No of physical page frames
	protected int pageFrameCount;
	
	// pageFrameCount - The number of physical page frames
	public ReplacementAlgorithm(int pageFrameCount) {
		if (pageFrameCount < 0) {
			throw new IllegalArgumentException();
		}
		
		this.pageFrameCount = pageFrameCount;
		pageFaultCount = 0;
	}
	
	//Return the number of page faults that have occurred
	public int getPageFaultCount(){
		return pageFaultCount;
	}
	
	//int pageNumber - the page number to be inserted
	public abstract void insert (int pageNumber);
	
}
