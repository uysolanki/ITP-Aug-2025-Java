package day17;

public class Customer2 {
		private String username;
		private String password;
		
		public Customer2() {}
		public Customer2(String username, String password) {
			this.username = username;
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		@Override
		public String toString() {
			return "Customer [username=" + username + ", password=" + password + "]";
		}
		
		
		public boolean login(String user,String pass)
		{
			if(user.equals(this.username) && pass.equals(this.password))
				return true;
			else
				return false;
		}
		
		
}
