SQLiteDatabase db = mDbHelper.getWritableDatabase();
 
ContentValues values = new ContentValues();
values.put(PetContract.PetEntry.COLUMN_PET_NAME, nameString);
values.put(PetContract.PetEntry.COLUMN_PET_BREED, breedString);
values.put(PetContract.PetEntry.COLUMN_PET_GENDER, mGender);
values.put(PetContract.PetEntry.COLUMN_PET_WEIGHT, weight);
 
long newRowId = db.insert(PetContract.PetEntry.TABLE_NAME, null, values);

