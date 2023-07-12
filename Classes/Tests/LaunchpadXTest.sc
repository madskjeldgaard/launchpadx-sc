LaunchpadXTest1 : UnitTest {
	test_check_classname {
		var result = LaunchpadX.new;
		this.assert(result.class == LaunchpadX);
	}
}


LaunchpadXTester {
	*new {
		^super.new.init();
	}

	init {
		LaunchpadXTest1.run;
	}
}
