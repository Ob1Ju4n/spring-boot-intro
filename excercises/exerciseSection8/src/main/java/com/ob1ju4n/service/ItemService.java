package com.ob1ju4n.service;

import com.ob1ju4n.domain.Item;
import com.ob1ju4n.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Juan on 26/09/2016.
 */
@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> list(){
        return itemRepository.findAll();
    }


    public Item read(long id) {
        return itemRepository.findOne(id);
    }

    public Item create(Item item) {
        return itemRepository.save(item);
    }

    public Item update(long id, Item item) {
        if(itemRepository.exists(id)){
            return itemRepository.save(item);
        }else{
            return null;
        }
    }

    public void delete(long id) {
        if(itemRepository.exists(id)){
            itemRepository.delete(id);
        }
    }

    public boolean exists(long id){
        return itemRepository.exists(id);
    }
}
