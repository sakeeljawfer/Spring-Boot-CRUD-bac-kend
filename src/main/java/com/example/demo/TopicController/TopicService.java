package com.example.demo.TopicController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
		
		public List<Topic> getAllTopics() {
			List<Topic> topics= new ArrayList<> ();
			topicRepository.findAll().forEach(topics::add);
			return topics;
			
		}
		
		public Topic getTopic(Integer id) {
			//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
			return topicRepository.findById(id).get();
		}

		public boolean addTopic(Topic topic) {
	
			topicRepository.save(topic);
			return true;
		}

		public void updateTopic(Topic topic, Integer id) {
			topicRepository.save(topic);
			
		}

		public void deleteTopic(Integer id) {
			
			topicRepository.deleteById(id);
		}

		
	}

	
	
	
