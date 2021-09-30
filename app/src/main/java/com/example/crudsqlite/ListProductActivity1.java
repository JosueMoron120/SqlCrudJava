package com.example.crudsqlite;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"},
        d2 = {"Lcom/example/crudsqlite/ListProductActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "getRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "CrudSqlite.app"}
)
public final class ListProductActivity1 extends AppCompatActivity {
    public RecyclerView recycler;

    @NotNull
    public final RecyclerView getRecycler() {
        RecyclerView var10000 = this.recycler;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycler");
        }

        return var10000;
    }

    public final void setRecycler(@NotNull RecyclerView var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.recycler = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300009);
        View var10001 = this.findViewById(1000138);
        Intrinsics.checkNotNullExpressionValue(var10001, "findViewById(R.id.rv_list_product)");
        this.recycler = (RecyclerView)var10001;
        RecyclerView var10000 = this.recycler;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycler");
        }

        var10000.setLayoutManager((LayoutManager)(new LinearLayoutManager((Context)this, 1, false)));
        SQLiteHelper sqLiteHelper = new SQLiteHelper((Context)this);
        ArrayList productList = sqLiteHelper.getAllProductos();
        Iterable $this$forEach$iv = (Iterable)productList;
        int $i$f$forEach = false;
        Iterator var6 = $this$forEach$iv.iterator();

        while(var6.hasNext()) {
            Object element$iv = var6.next();
            ProductModel it = (ProductModel)element$iv;
            int var9 = false;
            Log.i("ContentValues", String.valueOf(it.getNomprod()));
        }

        var10000 = this.recycler;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recycler");
        }

        var10000.setAdapter((Adapter)(new ProductAdapter(productList)));
    }
}