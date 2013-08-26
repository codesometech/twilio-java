package com.twilio.sdk.resource.instance;

import com.twilio.sdk.resource.instance.Transcription;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class TranscriptionTest extends BasicRequestTester {

    @Test
    public void testDeleteTranscription() throws Exception {
        setExpectedServerAnswer(null);
        setExpectedServerReturnCode(204);
        Transcription tr = new Transcription(client, "TR5f539674e9b84c2ba39a4156f264a347");
        assertTrue(tr.delete());
    }
}