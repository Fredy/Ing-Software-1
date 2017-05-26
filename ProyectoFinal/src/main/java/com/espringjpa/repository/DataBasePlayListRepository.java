package com.espringjpa.repository;

import java.util.Collection;

import org.springframework.stereotype.Component;
import com.espringjpa.domain.PlayList;

@Component
public class DataBasePlayListRepository implements IPlaylistRepository {
	// abrir connection a BD


		@Override
		public void save(PlayList playList) {
			// INSERT o UPDATE
		}

		@Override
		public PlayList get(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Collection<PlayList> getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void remove(String name) {
			// TODO Auto-generated method stub
		}
}
