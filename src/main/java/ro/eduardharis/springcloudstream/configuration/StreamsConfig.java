package ro.eduardharis.springcloudstream.configuration;

import org.springframework.cloud.stream.annotation.EnableBinding;
import ro.eduardharis.springcloudstream.stream.GreetingsStreams;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
