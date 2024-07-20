package com.ChatBot.ChatBot.chat;

import lombok.*;
import org.apache.logging.log4j.message.Message;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

   private String  message ;
   private String sender ;
   private Messagetype type ;




}
