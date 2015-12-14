public class SampleConfig {
	private String mDefaultParam1;
	private String mDefaultParam2;

	private String mParam1;
	private String mParam2;
	private String mParam3;

	private SampleConfig(String defaultParam1, String defaultParam2) {
		this.mDefaultParam1 = defaultParam1;
		this.mDefaultParam2 = defaultParam2;
	}

	private void setParam1(String param1) {
		this.mParam1 = param1;
	}

	public String getParam1() {
		return mParam1;
	}

	private void setParam2(String param2) {
		this.mParam2 = param2;
	}

	public String getParam2() {
		return mParam2;
	}

	private void setParam3(String param3) {
		this.mParam3 = param3;
	}

	public String getParam3() {
		return mParam3;
	}

	public static class Builder {
		private SampleConfig mSampleConfig;

		public Builder(String defaultParam1, String defaultParam2) {
			mSampleConfig = new SampleConfig(defaultParam1, defaultParam2);
		}

		public Builder setParam1(String param1) {
			mSampleConfig.setParam1(param1);
			return this;
		}

		public Builder setParam2(String param2) {
			mSampleConfig.setParam1(param2);
			return this;
		}

		public Builder setParam3(String param3) {
			mSampleConfig.setParam1(param3);
			return this;
		}

		public SampleConfig build() {
			return mSampleConfig;
		}
	}
}
