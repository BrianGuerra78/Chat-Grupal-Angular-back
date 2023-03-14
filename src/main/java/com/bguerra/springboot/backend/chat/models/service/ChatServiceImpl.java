package com.bguerra.springboot.backend.chat.models.service;

import com.bguerra.springboot.backend.chat.dao.ChatRepository;
import com.bguerra.springboot.backend.chat.models.documents.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService{

    @Autowired
    private ChatRepository chatDao;

    @Override
    public List<Mensaje> obtenerUltimos10Mensajes() {
        return chatDao.findFirst10ByOrderByFechaDesc();
    }

    @Override
    public Mensaje guardar(Mensaje mensaje) {
        return chatDao.save(mensaje);
    }
}
