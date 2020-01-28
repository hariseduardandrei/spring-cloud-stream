package ro.eduardharis.springcloudstream.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;
import ro.eduardharis.springcloudstream.message.Greetings;
import ro.eduardharis.springcloudstream.stream.GreetingsStreams;

@Service
@Slf4j
@AllArgsConstructor
public class GreetingsService {
    private final GreetingsStreams greetingsStreams;

    public void sendGreeting(final Greetings greetings) {
        log.info("Sending greetings {}", greetings);

        MessageChannel messageChannel = greetingsStreams.outboundGreetings();
        messageChannel.send(MessageBuilder.withPayload(greetings)
//                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());


    }
}
