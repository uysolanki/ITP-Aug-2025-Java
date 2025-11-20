package day42;

public class Engine {

		private int engineLitre;
		private int engineCC;
		private String engineType;
		private String engineMfg;
		
		public Engine() {}
		public Engine(int engineLitre, int engineCC, String engineType, String engineMfg) {
			this.engineLitre = engineLitre;
			this.engineCC = engineCC;
			this.engineType = engineType;
			this.engineMfg = engineMfg;
		}
		public int getEngineLitre() {
			return engineLitre;
		}
		public void setEngineLitre(int engineLitre) {
			this.engineLitre = engineLitre;
		}
		public int getEngineCC() {
			return engineCC;
		}
		public void setEngineCC(int engineCC) {
			this.engineCC = engineCC;
		}
		public String getEngineType() {
			return engineType;
		}
		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
		public String getEngineMfg() {
			return engineMfg;
		}
		public void setEngineMfg(String engineMfg) {
			this.engineMfg = engineMfg;
		}
		
		@Override
		public String toString() {
			return "Engine [engineLitre=" + engineLitre + ", engineCC=" + engineCC + ", engineType=" + engineType
					+ ", engineMfg=" + engineMfg + "]";
		}
		
		
}
