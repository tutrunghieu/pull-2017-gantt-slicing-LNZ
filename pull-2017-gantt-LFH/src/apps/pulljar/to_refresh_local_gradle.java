package apps.pulljar;

public class to_refresh_local_gradle extends PulljarAppMain 
{
	public static void main(String[] args) throws Exception
	{
		pull("https://www.dropbox.com/s/bmm5dgcqj7sx81l/naebulae-2017m04d01-minimal.jar?dl=0", "naebulae-2017m04d01-minimal.jar");
		pull("https://www.dropbox.com/s/ntni0gzcrobefhy/naebulae-20170601-dali-reunited.jar?dl=0", "naebulae-20170601-dali-reunited.jar"); 
		System.out.println("See " + getPulljarFile(""));
	}


	
}
