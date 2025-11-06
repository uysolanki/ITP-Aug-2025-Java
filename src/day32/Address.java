package day32;

public class Address {
		private int houseNo;
		private String houseType;
		private String city;
		
		public Address() {}
		public Address(int houseNo, String houseType, String city) {
			this.houseNo = houseNo;
			this.houseType = houseType;
			this.city = city;
		}
		public int getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(int houseNo) {
			this.houseNo = houseNo;
		}
		public String getHouseType() {
			return houseType;
		}
		public void setHouseType(String houseType) {
			this.houseType = houseType;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Address [houseNo=" + houseNo + ", houseType=" + houseType + ", city=" + city + "]";
		}
		
		
}
