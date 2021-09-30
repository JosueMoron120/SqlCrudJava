package com.example.crudsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rJ\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000bj\b\u0012\u0004\u0012\u00020\u000f`\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\"\u0010\u0019\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\"\u0010\u001c\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000f¨\u0006 "},
        d2 = {"Lcom/example/crudsqlite/SQLiteHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "deleteCategoria", "", "id", "deleteProducto", "idproducto", "getAllCategorias", "Ljava/util/ArrayList;", "Lcom/example/crudsqlite/CategoriaModel;", "Lkotlin/collections/ArrayList;", "getAllProductos", "Lcom/example/crudsqlite/ProductModel;", "insertCategoria", "", "cat", "insertProducto", "product", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onDowngrade", "oldVersion", "newVersion", "onUpgrade", "updateCategoria", "updateProducto", "Companion", "CrudSqlite.app"}
)
public final class SQLiteHelper1 extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME = "ventas.db";
    private static final String TB_Categoria = "categoria";
    private static final String TB_Producto = "producto";
    private static final String IDC = "idcategoria";
    private static final String IDP = "idproducto";
    private static final String NOMPROD = "nomprod";
    private static final String PRICE = "price";
    private static final String STOCK = "stock";
    private static final String NAME = "name";
    @NotNull
    public static final SQLiteHelper.Companion Companion = new SQLiteHelper.Companion((DefaultConstructorMarker)null);

    public void onCreate(@Nullable SQLiteDatabase db) {
        String createTbCategoria = "CREATE TABLE  categoria( idcategoria INTEGER PRIMARY KEY,name TEXT )";
        String createTbProducto = "CREATE TABLE  producto( idproducto INTEGER PRIMARY KEY,nomprod TEXT, price REAL, stock INTEGER , idcategoria INTEGER, FOREIGN KEY(idcategoria) REFERENCES categoria(idcategoria) )";
        if (db != null) {
            db.execSQL(createTbCategoria);
        }

        if (db != null) {
            db.execSQL(createTbProducto);
        }

    }

    public void onUpgrade(@Nullable SQLiteDatabase db, int oldVersion, int newVersion) {
        Intrinsics.checkNotNull(db);
        db.execSQL("DROP TABLE IF EXISTS categoria");
        db.execSQL("DROP TABLE IF EXISTS producto");
        this.onCreate(db);
    }

    public void onDowngrade(@Nullable SQLiteDatabase db, int oldVersion, int newVersion) {
        Intrinsics.checkNotNull(db);
        db.execSQL("DROP TABLE IF EXISTS categoria");
        db.execSQL("DROP TABLE IF EXISTS producto");
        this.onCreate(db);
    }

    public final long insertCategoria(@NotNull CategoriaModel cat) {
        Intrinsics.checkNotNullParameter(cat, "cat");
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("idcategoria", cat.getId());
        contentValues.put("name", cat.getName());
        long success = db.insert("categoria", (String)null, contentValues);
        db.close();
        return success;
    }

    @NotNull
    public final ArrayList getAllCategorias() {
        ArrayList catList = new ArrayList();
        String selectQuery = "SELECT * FROM categoria";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;

        try {
            cursor = db.rawQuery(selectQuery, (String[])null);
        } catch (Exception var8) {
            var8.printStackTrace();
            db.execSQL(selectQuery);
            return new ArrayList();
        }

        int id = false;
        String name = null;
        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndex("idcategoria"));
                String var10000 = cursor.getString(cursor.getColumnIndex("name"));
                Intrinsics.checkNotNullExpressionValue(var10000, "cursor.getString(cursor.getColumnIndex(NAME))");
                name = var10000;
                CategoriaModel cat = new CategoriaModel(id, name);
                catList.add(cat);
            } while(cursor.moveToNext());
        }

        return catList;
    }

    public final int updateCategoria(@NotNull CategoriaModel cat) {
        Intrinsics.checkNotNullParameter(cat, "cat");
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("idcategoria", cat.getId());
        contentValues.put("name", cat.getName());
        int success = db.update("categoria", contentValues, "id = " + cat.getId(), (String[])null);
        db.close();
        return success;
    }

    public final int deleteCategoria(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValue = new ContentValues();
        contentValue.put("idcategoria", id);
        int success = db.delete("categoria", "id = " + id, (String[])null);
        db.close();
        return success;
    }

    public final long insertProducto(@NotNull ProductModel product) {
        Intrinsics.checkNotNullParameter(product, "product");
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nomprod", product.getNomprod());
        contentValues.put("price", product.getPrecio());
        contentValues.put("stock", product.getStock());
        contentValues.put("idcategoria", product.getIdcategoria());
        long success = db.insert("producto", (String)null, contentValues);
        db.close();
        return success;
    }

    public final int deleteProducto(int idproducto) {
        SQLiteDatabase db = this.getWritableDatabase();
        int success = db.delete("producto", "idproducto = " + idproducto, (String[])null);
        return success;
    }

    public final int updateProducto(@NotNull ProductModel product) {
        Intrinsics.checkNotNullParameter(product, "product");
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nomprod", product.getNomprod());
        contentValues.put("price", product.getPrecio());
        contentValues.put("stock", product.getStock());
        contentValues.put("idcategoria", product.getIdcategoria());
        int successCode = db.update("producto", contentValues, "idproducto = " + product.getIdproducto(), (String[])null);
        db.close();
        return successCode;
    }

    @NotNull
    public final ArrayList getAllProductos() {
        SQLiteDatabase db = this.getReadableDatabase();
        ArrayList productList = new ArrayList();
        Cursor cursor = null;
        String selectQuery = "SELECT * FROM producto INNER JOIN categoria on producto.idcategoria = categoria.idcategoria";

        try {
            cursor = db.rawQuery(selectQuery, (String[])null);
        } catch (Exception var6) {
            var6.printStackTrace();
            db.execSQL(selectQuery);
            return new ArrayList();
        }

        if (cursor.moveToFirst()) {
            do {
                int var10003 = cursor.getInt(cursor.getColumnIndex("idproducto"));
                String var10004 = cursor.getString(cursor.getColumnIndex("nomprod"));
                Intrinsics.checkNotNullExpressionValue(var10004, "cursor.getString(\n      …                        )");
                double var10005 = cursor.getDouble(cursor.getColumnIndex("price"));
                int var10006 = cursor.getInt(cursor.getColumnIndex("stock"));
                int var10007 = cursor.getInt(cursor.getColumnIndex("idcategoria"));
                String var10008 = cursor.getString(cursor.getColumnIndex("name"));
                Intrinsics.checkNotNullExpressionValue(var10008, "cursor.getString(cursor.getColumnIndex(NAME))");
                productList.add(new ProductModel(var10003, var10004, var10005, var10006, var10007, var10008));
            } while(cursor.moveToNext());
        }

        db.close();
        return productList;
    }

    public SQLiteHelper(@Nullable Context context) {
        super(context, "ventas.db", (CursorFactory)null, 2);
    }

    @Metadata(
            mv = {1, 5, 1},
            k = 1,
            d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"},
            d2 = {"Lcom/example/crudsqlite/SQLiteHelper$Companion;", "", "()V", "DATABASE_NAME", "", "DATABASE_VERSION", "", "IDC", "IDP", "NAME", "NOMPROD", "PRICE", "STOCK", "TB_Categoria", "TB_Producto", "CrudSqlite.app"}
    )
    public static final class Companion {
        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}