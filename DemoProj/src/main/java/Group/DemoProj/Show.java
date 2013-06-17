package Group.DemoProj;

public class Show<Viewer> {
	private Viewer Viewer;
	private String list;

	public String getViewerList(String newTest, String newShow, String newVotes, int viewerCount){
		list = list+newTest+"/n";
		list = list+newShow+"/n";
		for(int i = 1; i <= viewerCount; i++){
			list = list+newVotes+"/n";
		}
		return list;
	}
	
	public Viewer getViewer() {
		
		return Viewer;
	}

	public void setViewer(Viewer viewer) {
		Viewer = viewer;
	}
}
