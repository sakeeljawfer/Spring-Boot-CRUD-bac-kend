package com.example.demo.TopicController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
		
		@Autowired
		private TopicService topicservice;
		
		
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping("/rest/v2/topics")
		public List<Topic>getAllTopic(){
			
			return topicservice.getAllTopics();
		}
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping("/rest/v2/topics/{id}")
		public Topic getTopic(@PathVariable Integer id) {
			return topicservice.getTopic(id);
		}
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(method =RequestMethod.POST,value="/rest/v2/topics")
		public boolean addTopic(@RequestBody Topic topic) {
			return topicservice.addTopic(topic);
		}
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(method =RequestMethod.PUT,value="/rest/v2/topics/{id}")
		public void updateTopic(@RequestBody Topic topic,@PathVariable Integer id) {
			topicservice.updateTopic(topic ,id);
		}
		@CrossOrigin(origins = "http://localhost:4200")
		@RequestMapping(method =RequestMethod.DELETE,value="/rest/v2/topics/{id}")
		public void deleteTopic(@PathVariable Integer id) {
			topicservice.deleteTopic(id);
		}
		
		
}
