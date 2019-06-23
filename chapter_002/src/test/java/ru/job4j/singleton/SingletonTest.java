package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SingletonTest {
    @Test
    public void trackerStaticFieldTest() {
        TrackerStaticField tracker1 = TrackerStaticField.getInstance();
        TrackerStaticField tracker2 = TrackerStaticField.getInstance();
        assertThat(tracker1 == tracker1, is(true));
    }

    @Test
    public void trackerEnumTest() {
        TrackerEnum tracker1 = TrackerEnum.INSTANCE;
        TrackerEnum tracker2 = TrackerEnum.INSTANCE;
        assertThat(tracker1 == tracker1, is(true));
    }

    @Test
    public void trackerStaticFinalFieldTest() {
        TrackerStaticFinalField tracker1 = TrackerStaticFinalField.getInstance();
        TrackerStaticFinalField tracker2 = TrackerStaticFinalField.getInstance();
        assertThat(tracker1 == tracker1, is(true));
    }

    @Test
    public void trackerPrivateStaticFinalClassTest() {
        TrackerPrivateStaticFinalClass tracker1 = TrackerPrivateStaticFinalClass.getInstance();
        TrackerPrivateStaticFinalClass tracker2 = TrackerPrivateStaticFinalClass.getInstance();
        assertThat(tracker1 == tracker1, is(true));
    }
}
