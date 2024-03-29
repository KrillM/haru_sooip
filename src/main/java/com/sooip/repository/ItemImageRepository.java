package com.sooip.repository;

import com.sooip.entity.ItemImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemImageRepository extends JpaRepository<ItemImage, Long> {
    List<ItemImage> findByItemIdOrderByIdAsc(Long itemId);

    ItemImage findByItemIdAndRepImgYn(Long itemId, String repImgYn);
}
