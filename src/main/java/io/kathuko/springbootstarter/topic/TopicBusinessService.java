package io.kathuko.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicBusinessService {

	List<TopicDto> topicList = new ArrayList<TopicDto>(
			Arrays.asList(new TopicDto("Spring Boot", "Spring Boot Application", "Spring Boot Application Framework"),
					new TopicDto("Java", "Core Java", "Fundamentals of Core Java")));

	public List<TopicDto> getAllTopics() {
		return topicList;
	}

	public TopicDto getTopic(String id) {
		return topicList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
	}

	public void addTopic(TopicDto topic) {
		topicList.add(topic);

	}

	public void updateTopic(TopicDto topic, String id) {
		for (int i = 0; i < topicList.size(); i++) {
			TopicDto topic1 = topicList.get(i);
			if (topic1.getId().equals(id)) {
				topicList.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topicList.removeIf(topic -> topic.getId().equals(id));
	}
}
