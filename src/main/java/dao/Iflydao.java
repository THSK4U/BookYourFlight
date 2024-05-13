package dao;

import java.util.List;

import metier.vol;
import metier.airport;

public interface Iflydao {
	public void saveVol(vol vol);
	public List<vol> allvol(vol vol);
	public airport volbyid(int  id);
	public void updateVol(vol vol);
}
