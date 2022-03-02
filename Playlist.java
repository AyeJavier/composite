public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	void add(IComponent song){
		this.playlist.add(song);
	}
 
	void remove(IComponent song){
		this.playlist.remove(song);
	}

	@Override
	public void play(){
		for(IComponent song : this.playlist){
			song.play();
		}
	} 

	@Override
	public void setPlaybackSpeed(float speed){
		for(IComponent song : this.playlist){
				song.setPlaybackSpeed(speed);
		}	
	}

   @Override
   public String getName(){
	   return this.playlistName;
   }

   

}
